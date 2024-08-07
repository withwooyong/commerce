package kr.co.yanadoo.controller;

import kr.co.yanadoo.entity.Member;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ApiController {

    @GetMapping("/test")
    public String test() {
        Member member = Member.builder()
                .server("yanadoo-api").build();
        log.info("member={}", member);
        return member.toString();
    }
}
