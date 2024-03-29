package com.wcz0.asb.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.github.yitter.idgen.YitIdHelper;
import org.springframework.stereotype.Component;

/**
 * @author wcz0
 */
@Component
public class IdGeneratorConfig implements IdentifierGenerator {

    @Override
    public Number nextId(Object entity) {
        return YitIdHelper.nextId();
    }
}
