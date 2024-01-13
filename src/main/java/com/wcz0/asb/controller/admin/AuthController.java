package com.wcz0.asb.controller.admin;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wcz0
 */
@Slf4j
@RestController("AdminAuthController")
@RequestMapping("admin-api")
@Api(tags = "验证")
public class AuthController {

}
