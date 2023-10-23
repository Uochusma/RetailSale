package common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.item.ItemReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public abstract class CommonBaseConfiguration {
    protected static Logger logger = LoggerFactory.getLogger(CommonBaseConfiguration.class);

    public  abstract Step step1(ItemReader reader) throws Exception;

    public  abstract Job job(Step step) throws Exception;
}
