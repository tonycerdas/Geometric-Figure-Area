<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilos.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Cálculo de áreas</title>
    </head>

    <body>
        <%
            
            Object valor = request.getAttribute("valor");
            Object figura = request.getAttribute("figura");
            if(valor== null){
                valor = "";
            }
             if(figura== null){
                figura = "";
            }
        %>
        <div class="all">
            <form method="POST" action="Servlet" id="form">
                <select id="selectFigura" name="selectOption">
                    <option value="tr">Triangulo</option>
                    <option value="cu">Cuadrado</option>
                    <option value="re">Rectangulo</option>
                    <option value="ro">Rombo</option>
                </select>
                <div class="form-group" id="divA">
                    <label for="forladoA" id="labelA">Base:</label>
                    <input type="text" class="form-control" state="" value="" id="ladoA" placeholder="--" name="LadoA" autofocus>
                </div>
                <div class="foSrm-group" id="divB">
                    <label for="forladoB" id="labelB">Altura:</label>
                    <input type="text" class="form-control" state="" id="ladoB" placeholder="--" name="LadoB">
                </div>
                <div class="botones">
                    <div class="enviar">
                        <button type="submit" id="enviarbtn" class="btn btn-primary">Calcular</button>
                    </div>    
                    <div class="clean">
                        <button type="button" id="cleanbtn" class="btn btn-primary">Limpiar</button>
                    </div>
                </div>
            </form>

            <div class="areaText">
                <label for="area">Área de:</label>
                <label for="respuesta" id="labelArea"><%=figura%></label>
                <input type="text" readonly class="form-control" id="areaResult" placeholder="---" name="areaResultName" value="<%=valor%>">
            </div>
        </div>      

        <script src="main.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    </body>

</html>