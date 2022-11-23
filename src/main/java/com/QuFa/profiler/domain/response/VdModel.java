package com.QuFa.profiler.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class VdModel {
    String type;
    List<Map<Object, Object>> value;
    Object range;
}
