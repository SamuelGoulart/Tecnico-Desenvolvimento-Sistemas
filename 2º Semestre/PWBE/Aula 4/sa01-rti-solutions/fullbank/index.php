<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHL Fretes</title>
    <link rel="stylesheet" href="../styles-global.css">
</head>

<body>
    <form method="GET" action="calcula-aumento-salarial.php">

        <h1>Aumento para os Funcionários</h1>
        <div class="input-group" >
            <label for="nome">Iforme o nome do funcionário</label>
            <input type="text" name="nome" id="nome" required >
        </div>

        <div class="input-group" >
            <label for="salario_atual">Salário atual</label>
            <input type="text" name="salario_atual" id="salario_atual" required >
        </div>
        <button>Enviar</button>
    </form>
</body>

</html>