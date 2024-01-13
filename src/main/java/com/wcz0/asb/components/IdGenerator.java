package com.wcz0.asb.components;

import com.github.yitter.contract.IdGeneratorOptions;
import com.github.yitter.idgen.YitIdHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wcz0
 */
@Component
public class IdGenerator {

    public IdGenerator(@Value("${id-generator.worker-id}") short workerId) {
        IdGeneratorOptions options = new IdGeneratorOptions(workerId);
//        options.WorkerIdBitLength = 10;
//        options.SeqBitLength = 10;
//        options.BaseTime = 1622505600000L;

        YitIdHelper.setIdGenerator(options);
    }

}
