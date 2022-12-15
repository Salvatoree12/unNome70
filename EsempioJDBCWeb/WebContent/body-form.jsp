  <%@ include file="header.jsp" %>
  <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                      
                            <form action="/EsempioJDBCWeb/Registrazione" method="get">


                        <caption>
                            <h2>
                                
                            </h2>
                        </caption>

                        
                            <input type="hidden" name="id" value="" />
                        

                        <fieldset class="form-group">
                            <label>User Name</label> <input type="text" value="" class="form-control" name="nome" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Email</label> <input type="text" value="" class="form-control" name="email">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Country</label> <input type="text" value="" class="form-control" name="citta">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
	  <%@ include file="footer.jsp"%>
            