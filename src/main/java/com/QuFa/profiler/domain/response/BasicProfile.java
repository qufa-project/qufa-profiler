package com.QuFa.profiler.domain.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicProfile {
    int row_cnt;
    int distinct_cnt;
    int null_cnt;
    double distinctness;
    int unique_cnt;
    VdModel value_distribution;
}
