package org.home;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Shouvik on 5/10/2017.
 */
@Data
@AllArgsConstructor
@Builder
public class Dummy {

    public String name;
    public Integer age;


    public void mess() {
        new Dummy("", 10);
       Dummy d =  Dummy.builder().name("").age(10).build();
    }
}
