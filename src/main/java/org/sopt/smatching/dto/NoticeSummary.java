package org.sopt.smatching.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NoticeSummary {

    private int noticeIdx;
    private String title;
    private String institution;
    private int dday;
}
