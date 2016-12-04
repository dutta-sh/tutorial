package org.home;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Shouvik on 12/3/2016.
 */
@Data
@AllArgsConstructor
public class RestResponse implements Serializable{
    private String name;
    private Integer hitCount;
}