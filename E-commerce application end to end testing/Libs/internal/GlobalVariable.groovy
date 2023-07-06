package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object gender
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object company
     
    /**
     * <p></p>
     */
    public static Object dateofBirthDay
     
    /**
     * <p></p>
     */
    public static Object dateofBirthMonth
     
    /**
     * <p></p>
     */
    public static Object dateofBirthYear
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            firstName = selectedVariables['firstName']
            lastName = selectedVariables['lastName']
            gender = selectedVariables['gender']
            email = selectedVariables['email']
            company = selectedVariables['company']
            dateofBirthDay = selectedVariables['dateofBirthDay']
            dateofBirthMonth = selectedVariables['dateofBirthMonth']
            dateofBirthYear = selectedVariables['dateofBirthYear']
            url = selectedVariables['url']
            password = selectedVariables['password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
