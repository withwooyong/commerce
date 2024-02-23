package kr.co.yanadoo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    String server;

    @Builder.Default
    String name = "Ted";

    @Builder.Default
    int age = 20;

    @Builder.Default
    LocalDateTime createdAt = LocalDateTime.now();


}
