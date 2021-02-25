<?php
    
  if(!isset($_GET["cidade-origem"])
     || !isset($_GET["destino"])
     || !isset($_GET["distancia"])
     || !isset($_GET["pedagios"])){

      header("location: index.php");
  }

   $cidadeOrigem = $_GET["cidade-origem"];
   $destino = $_GET["destino"];
   $distancia = $_GET["distancia"];
   $pedagios = $_GET["pedagios"];

   $cunstoPedagios = $pedagios * 9.4;
   $custoDistancia = $distancia * 6;

   $custoTotal = $cunstoPedagios + $custoDistancia;
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculo de Frete PHL</title>
    <link rel="stylesheet" href="../styles-global.css">

</head>
<body>
    <!-- Se o valor do pedágio for maior que 100, exibir em vermelho -->
    <?php
      if($cunstoPedagios > 100){
          echo "<h1 style='color: red;' >Valor dos pedágios: R$ <em>$cunstoPedagios</em></h1>";
      }else{
          echo "<h1>Valor dos pedágios: R$ <em>$cunstoPedagios</em></h1>";
      }
      ?>
    <h1>A viagem de <?= $cidadeOrigem ?> à <?= $destino?> irá custar o valor total de <em><?=  number_format($custoTotal, 2, ",", ".") ?>.</em></h1>
</body>
</html>