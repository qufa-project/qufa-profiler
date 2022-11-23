package com.QuFa.profiler.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Source {

    private String type = "url";
    private String path = null;
    private String url = null;
}
