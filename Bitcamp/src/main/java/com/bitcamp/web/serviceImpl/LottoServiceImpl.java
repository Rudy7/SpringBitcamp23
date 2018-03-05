package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;

@Service
public class LottoServiceImpl implements LottoService{
	@Autowired LottoDTO lotto;

	@Override
	public LottoDTO findlottoCount(LottoDTO param) {
		// TODO Auto-generated method stub
		int count = 0;
		String money=param.getMoney();
		if(Integer.parseInt(param.getMoney()) < 100000) {
			int conunt = Integer.parseInt(money)/1000;
			lotto.setCount("count");
		}
		return lotto;
	}

	@Override
	public LottoDTO createLotto() {  // 한줄
		// TODO Auto-generated method stub
		LottoDTO lotto = new LottoDTO(); 
		String num = "";
            int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = ((int) (Math.random() * 45 + 1));
                    for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                            i--;
                        }
                    }
            }
            for (int i = 0; i < 6; i++) {
                if (i == 5) {
                    num += arr[i];
                } else {
                    num += arr[i] + ",";
                }
                lotto.setLottoNumber(num); // 한줄 3, 6, 16, 13, 23, 45
            }
        
	/*	lotto.setLottoNumber(""); */
        System.out.println("테스트 한줄"+lotto);
		return lotto;
	}
	
	@Override
	public List<LottoDTO> createLottos(LottoDTO param) { // 여러줄 //리스트객체에서는 new객체생성해야된다.
		// TODO Auto-generated method stub
		List<LottoDTO> list = new ArrayList<>();
		String count = findlottoCount(param).getCount();
		
		for(int i=0; i<Integer.parseInt(param.getMoney())/1000; i++) {
			lotto = createLotto();
			list.add(lotto);
		}
		System.out.println(list);
		return list;
	}
	
	
	
	

	/*
	 * String num = "";
	int[] arr = new int[6];
	for(int i=0; i<Integer.parseInt(param.getMoney())/1000; i++) {
        for (int f = 0; f < 6; f++) {
            arr[f] = ((int) (Math.random() * 45 + 1));
                for (int j = 0; j < i; j++) {
                    if (arr[f] == arr[j]) {
                        f--;
                    }
                }
        }
        for (int f = 0; f < 6; f++) {
            if (i == 5) {
                num += arr[f];
            } else {
                num += arr[f] + ",";
            }
            lotto.setLottoNumber(num);
        }
	}
	*/	
	
	
	
	
/*	 
 *   public void onClick(View view) {
            String num = "";
            int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = ((int) (Math.random() * 45 + 1));
                    for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                            i--;
                        }
                    }
            }
            for (int i = 0; i < 6; i++) {
                if (i == 5) {
                    num += arr[i];
                } else {
                    num += arr[i] + ",";
                }
                result.setText(num);
            }
        }
*/


}
