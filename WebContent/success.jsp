<%@ taglib prefix="s" uri="/struts-tags" %>
<s:label>Hi</s:label>
<s:property value="name" />
<s:form action="div1" >  
<!--<s:radio name="gender" label="Gender" list="{'Male','Female'}" /> -->
<s:checkbox label="C1" name="checkbox" fieldValue="tam"/>
<s:checkbox label="C2" name="checkbox" />
<s:textfield name="divObj.num" label="Numerator"></s:textfield> 
<s:textfield name="divObj.denom" label="Denominator"></s:textfield> 
<s:submit value="Submit"></s:submit>  
</s:form>
