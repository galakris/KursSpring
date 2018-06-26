package com.example.kursspring;

import com.example.kursspring.domain.repository.KnightRepository;
import com.example.kursspring.domain.Knight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KursspringApplicationTests {

	@Autowired
	Knight knight;
	@Autowired
    KnightRepository knightRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCastle(){
		String except = "Znajduje się tu zamek o nazwie Castle Black. Zamieszkały przec rycerza: Rycerz o imieniu: Lancelot(29). Ma zadanie: Uratuj Księżniczkę";
		assertEquals(except, knightRepository.toString());
	}

}
