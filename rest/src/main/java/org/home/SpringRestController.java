package org.home;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shouvik on 12/3/2016.
 */
@RestController
public class SpringRestController {

    private static Integer hit = 0;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestResponse hello(@PathVariable String name) {
        hit++;
        return new RestResponse(name, hit);
    }

    @ExceptionHandler(Exception.class)
    public RestResponse handleError(Exception e) {
        return new RestResponse(e.getMessage(), 0);
    }
}