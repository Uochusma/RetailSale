package item;

import common.CommonBaseConfiguration;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;


public class SaleItemConfiguration extends CommonBaseConfiguration {
    @Autowired
    private JobBuilder jobBuilderFactory;

    @Autowired
    private StepBuilder stepBuilderFactory;

    @Bean
    public Step step() {
        return stepBuilderFactory.get("step")
                .tasklet((contribution, chunkContext) -> {
                    // ループ処理
                    for (int i = 0; i < 5; i++) {
                        // 各ステップの処理
                        System.out.println("Step " + (i + 1) + " processing...");
                        //reader
                        //processor
                        //writer
                    }
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Job job() {
        return jobBuilderFactory.get("myJob")
                .start(step())
                .build();
    }

    @Override
    public Step step1(ItemReader reader) throws Exception {
        return null;
    }

    @Override
    public Job job(Step step) throws Exception {
        return null;
    }
}
