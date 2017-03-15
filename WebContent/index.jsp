<%@ taglib uri="/struts-tags" prefix="s" %>  
<s:form action="welcome" >  
<s:textfield name="name" label="Name" />  
<s:password name="pass" label="Password" />
<s:submit value="Submit"></s:submit>  
</s:form>