package org.home;

import java.lang.annotation.Documented;

/**
 * Created by Shouvik on 4/29/2017.
 */
@Documented
public @interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}