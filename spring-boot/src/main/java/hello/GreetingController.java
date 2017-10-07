package hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@Scope("prototype")
@Slf4j
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) throws InterruptedException {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/sleep")
    public Greeting sleepTest() throws InterruptedException {
        log.info("Sleep request");
        Thread.sleep(5000);
        return new Greeting(100, "WIP");
    }

    @RequestMapping(value = "/callable", method = RequestMethod.GET)
    public Callable<Greeting> timeCallable() {
        log.info("Callable time request");
        return () -> new Greeting(100, "Callable");
    }

    @RequestMapping(value = "/deferred", method = RequestMethod.GET)
    public DeferredResult<Greeting> timeDeferred() {
        log.info("Deferred time request");
        DeferredResult<Greeting> result = new DeferredResult<>();

        new Thread(() -> {
            result.setResult(new Greeting(100, "Deferred"));
        }, "MyThread-" + counter.incrementAndGet()).start();

        return result;
    }
}