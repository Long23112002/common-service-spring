package com.longnh.annotions;

import com.longnh.config.Config;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({Config.class})
public @interface EnableCommon {
}
