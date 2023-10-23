package item;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemWriter;

public class SalaItemWriter implements ItemWriter<Object>, StepExecutionListener {
    private StepExecution stepExecution;
    @Override
    public void write(Chunk<?> chunk) throws Exception {
        ExecutionContext executionContext = this.stepExecution.getExecutionContext();
    }

    public void process(){
        ExecutionContext executionContext = this.stepExecution.getExecutionContext();
    }

    @Override
    public void beforeStep(StepExecution stepExecution) {
        StepExecutionListener.super.beforeStep(stepExecution);
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        return StepExecutionListener.super.afterStep(stepExecution);
    }
}
