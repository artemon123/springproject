package com.filemanager.onlinemg;

import com.filemanager.onlinemg.controllers.FilmController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OnlinemgApplicationTests {

	@Autowired
	FilmController filmController;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {
	 this.mockMvc.perform(get("/films/tickets"))
			 	.andDo(print())
				.andExpect(status().isOk()).andExpect(content().string(containsString("avatar")));

	}

}
