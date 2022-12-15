<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>

        <head>
            <title>User Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="" class="navbar-brand"> User Management App </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="" class="nav-link">Users</a></li>
                    </ul>
                </nav>
            </header>
            
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
        </body>

        </html>