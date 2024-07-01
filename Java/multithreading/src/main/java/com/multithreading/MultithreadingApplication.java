package com.multithreading;

import com.multithreading.problems.q1.FileWritingTheory;
import com.multithreading.problems.q1.Q1Usage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MultithreadingApplication {

	public static void main(String[] args) {
//		Usage.useThread();
//		SyncUsage.usingCommonObject();
//		SyncUsage.usingDiffObject();
//		CommunicationUsage.print();
//		SpringApplication.run(DesignpatternApplication.class, args);
//		FileHandlingTheory.useScanner();
//		FileHandlingTheory.usePath();
		Q1Usage.execute();
//		FileWritingTheory.usingBufferedReader();
	}

}
