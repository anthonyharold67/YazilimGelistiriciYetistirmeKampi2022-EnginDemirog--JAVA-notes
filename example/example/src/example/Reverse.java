package example;

public class Reverse {

	public void reverse(String text) {
		String[] textArr = text.split("");
		String newText = "";
		
		
		for (int i = textArr.length-1; i>=0; i--) {
			//newText = newText.concat(textArr[i]);
			newText += textArr[i];
		}
		
		System.out.println(newText);

	}

}