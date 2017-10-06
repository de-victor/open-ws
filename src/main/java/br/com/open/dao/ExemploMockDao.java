package br.com.open.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.open.models.mock.ExempleModel;

public class ExemploMockDao {

	private static ExemploMockDao instance;
	
	private ExemploMockDao(){}
	
	public static ExemploMockDao getInstance(){
		if(instance == null){
			instance = new ExemploMockDao();
			return instance;
		}
		
		return instance;
	}
	
	public List<ExempleModel> getExemples(ExempleModel exempleModel){
		List<ExempleModel> list = new ArrayList<ExempleModel>();
		ExempleModel model1 = new ExempleModel();
		ExempleModel model2 = new ExempleModel();
		
		model1.setCode(1);
		model1.setName("Mr. Snow");
		model1.setAddress("Winterfell Street");
		
		model2.setCode(2);
		model2.setName("Mr. Stark");
		
		list.add(model1);
		list.add(model2);
		
		return list;
	}
	
}
