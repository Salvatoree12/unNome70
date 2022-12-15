<%@ include file="header.jsp" %>
<%@page    import="java.util.*" %>
<%@page    import="model.*" %>
<br>

            <div class="row">

                <div class="container">
                    <h3 class="text-center">List of Users</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="user-form.jsp" class="btn btn-success">Add
     New User</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Country</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                        <% List<User> utenteArray = (List<User>)request.getAttribute("ListaUtenti"); 
                        for(User u: utenteArray){
                 			
                        %>
             
                       	        <tr>
                                    <td>
                                   <%=u.getId() %>  
                                    </td>
                                    <td>
                                   <%=u.getNome() %>     
                                    </td>
                                    <td>
                                    <%=u.getEmail() %>    
                                    </td>
                                    <td>
                                    <%=u.getCitta() %>    
                                    </td>
                                    <td><a href="">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="user-list.jsp">Delete</a></td>
                                </tr>
                		<% } %>           
                        </tbody>

                    </table>
                </div>
            </div>
            <%@ include file="footer.jsp"%>