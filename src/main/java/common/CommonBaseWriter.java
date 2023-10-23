package common;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

import org.slf4j.Logger;

public class CommonBaseWriter implements ItemWriter<Object> {

    protected static Logger logger = LoggerFactory.getLogger(CommonBaseWriter.class);

    public void process(){

    }

    public void afterStep(StepExecution stepExecution){
        //stepExecution.getExecutionContext().getInt();
    }


    @Override
    public void write(Chunk<?> chunk) throws Exception {

    }
}
