
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package gov.samhsa.consent2share.accesscontrolservice.brms.client;

import gov.samhsa.consent2share.contract.ruleexecutionservice.RuleExecutionServicePortType;
import gov.samhsa.consent2share.schema.ruleexecutionservice.AssertAndExecuteClinicalFactsResponse;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-07-09T09:27:31.538-04:00
 * Generated source version: 2.6.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "RuleExecutionService",
                      portName = "RuleExecutionServicePort",
                      targetNamespace = "http://www.samhsa.gov/consent2share/contract/RuleExecutionService",
                      wsdlLocation = "classpath:RuleExecutionService.wsdl",
                      endpointInterface = "gov.samhsa.consent2share.contract.ruleexecutionservice.RuleExecutionServicePortType")
                      
public class RuleExecutionServicePortTypeImpl implements RuleExecutionServicePortType {

    private static final Logger LOGGER = LoggerFactory.getLogger(RuleExecutionServicePortTypeImpl.class);
    protected static AssertAndExecuteClinicalFactsResponse returnedValueOfAssertAndExecuteClinicalFacts;

    /* (non-Javadoc)
     * @see gov.samhsa.consent2share.contract.ruleexecutionservice.RuleExecutionServicePortType#assertAndExecuteClinicalFacts(gov.samhsa.consent2share.schema.ruleexecutionservice.AssertAndExecuteClinicalFactsRequest  parameters )*
     */
    public gov.samhsa.consent2share.schema.ruleexecutionservice.AssertAndExecuteClinicalFactsResponse assertAndExecuteClinicalFacts(gov.samhsa.consent2share.schema.ruleexecutionservice.AssertAndExecuteClinicalFactsRequest parameters) { 
    	LOGGER.debug("Executing operation assertAndExecuteClinicalFacts");
        LOGGER.debug(parameters.toString());
        try {
        	return returnedValueOfAssertAndExecuteClinicalFacts;
        } catch (java.lang.Exception ex) {
            LOGGER.error(ex.getMessage(),ex);
            throw new RuntimeException(ex);
        }
    }

}
