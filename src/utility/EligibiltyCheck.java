package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		
		return basicEligibilityCheck(user);
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		int point = Integer.parseInt(points);
		if(point>80)
		{
			return true;
		}
		else
		{
		    return false;
		}
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		if(user.getAge() >= 18 && user.getAge() <= 35 && 155 <= user.getHeight() && 170 >= user.getHeight() && user.getWeight() >= 55 && user.getWeight() <= 90 && user.getCountry().contentEquals("ProGrad"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
















