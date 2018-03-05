package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.bitcamp.web.domain.LottoDTO;
@Component
public interface LottoService {
	public LottoDTO findlottoCount(LottoDTO param);
	public LottoDTO createLotto();  // 한줄만 만들어요 2,4,13,20,33,41
	public List<LottoDTO> createLottos(LottoDTO param);	// 여러줄 만들어요 2,4,13,20,33,41		2,4,13,20,33,41		2,4,13,20,33,41
	
	
}
