package test;


/**
 * 密文数据类型
 * Created by zhou01.zhao on 2016/12/23.
 */
public enum CipherDataType {


	DEFAULT(0, "common", "公用秘钥"),
	CVV2(1, "cvv2", "信用卡CVV2"),
	BANK_CARD(2, "bankCard", "银行卡号"),
	IDENTITY_CARD(3, "identityCard", "身份证号");
	private final int value;
	private final String description;
	private final String name;

	CipherDataType(int value, String name, String description) {
		this.value = value;
		this.name = name;
		this.description = description;
	}

	public int value(){
		return value;
	}

	public String getName() {
		return name;
	}

	public String description() {
		return description;
	}

	public static CipherDataType getCipherDataTypeByValue(int value){
		for(CipherDataType type : CipherDataType.values()){
			if(type.value == value){
				return type;
			}
		}
		return null;
	}
}
