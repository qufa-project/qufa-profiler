package com.QuFa.profiler.domain;

import com.QuFa.profiler.domain.request.Profiles;
import lombok.Getter;

@Getter
public class Local {

    private Source source;
    private boolean header = true;
    private Profiles profiles;

}