<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<h1>New Book</h1>
<form:form action="/entity" method="post" modelAttribute="entity">
   <p>
        <form:label path="id">ID</form:label>
        <form:errors path="id"/>
        <form:input path="id"/>
    </p>
    <p>
        <form:label path="code">CODE</form:label>
        <form:errors path="code"/>
        <form:input path="code"/>
    </p>
    <p>
        <form:label path="continent">CONTINENTE</form:label>
        <form:errors path="continent"/>
        <form:textarea path="continent"/>
    </p>
    <p>
        <form:label path="name">NOMBRE</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="region">REGION</form:label>
        <form:errors path="region"/>     
        <form:input type="number" path="region"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    

