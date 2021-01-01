<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
       <html>
       <head>
           <title>Java</title>
       </head>
       <body>
       <div align="center">
       <caption> TODO Items</caption>
       <c:url var="addUrl" value="/addItem"/>
        <h3><a href="${addUrl}"> Add Item</a></h3>
         <table border=1 cellpadding=5>
         <tr>
         <th>Task</th>
         <th>Details</th>
         <th>Dead Line</th>
         <th>Action</th>
         </tr>
         <c:forEach var="item"  items="${itemData.items}">
         <c:url var="deleteUrl" value="delete">
            <c:param name="id" value="${item.id}"/>
         </c:url>
         <c:url var="editUrl" value="addEditItem">
              <c:param name="id" value="${item.id}"/>
          </c:url>
           <c:url var="viewUrl" value="item">
                <c:param name="id" value="${item.id}"/>
            </c:url>
         <tr>
         <td><c:out value="${item.title}"/></td>
         <td><c:out value="${item.details}"/></td>
         <td><c:out value="${item.deadLine}"/></td>
         <td><a href="${deleteUrl}">Delete</a> <a href="${editUrl}">Edit</a><a href="${viewUrl}">View</a></td>
         </tr>
         </c:forEach>
         </table>
         </div>
         </body>
       </html>