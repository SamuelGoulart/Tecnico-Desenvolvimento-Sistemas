<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHL Fretes</title>
    <link rel="stylesheet" href="../styles-global.css">
</head>

<body>
    <form method="GET" action="calcula-Frete.php">

        <h1>Calculo de Frete</h1>
        <div class="input-group" >
            <label for="origim">Cidade de Origin</label>
            <input type="text" name="cidade-origem" id="origim" required >
        </div>

        <div class="input-group" >
            <label for="destino">Cidade de Destino</label>
            <input type="text" name="destino" id="destino" required >
        </div>

        <div class="input-group" >
            <label for="distancia">Distância em KM</label>
            <input type="number" name="distancia" id="distancia" required  >
        </div>

        <div class="input-group" >
            <label for="pedagios">Quantidade de pedágios</label>
            <input type="number" name="pedagios" id="pedagios" required >
        </div>
        <button>Enviar</button>
    </form>
</body>

</html>