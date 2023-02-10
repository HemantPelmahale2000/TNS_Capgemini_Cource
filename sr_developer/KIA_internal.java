package sr_developer;
import jr_developer.KIA_Airbags;
// OR  import jr_developer.*;
public class KIA_internal {

	public static void main (String[]args) {
		KIA_Airbags obj = new KIA_Airbags();
		// OR jr_developer.KIA_Airbags obj = new jr_developer.KIA_Airbag();
		// Pname.class_name obj var= new Pname.class_name;
		//                 |obj_var.method_name();
		obj.deep();
	}
}
