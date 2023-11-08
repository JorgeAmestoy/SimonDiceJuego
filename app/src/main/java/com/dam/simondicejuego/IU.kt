package com.dam.simondicejuego

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




/**
 * FUNCION DEL JUEGO QUE
 * TIENE LOS BOTONES Y SUS FUNCIONES
 */
@Composable
fun Juego(miViewModel: MyViewModel){
    Box{

        if(miViewModel.getContador()<10){
            Text("Rondas: ${miViewModel.getContador()}",
                modifier = Modifier
                    .offset(y = 350.dp)
                    .offset(x = 55.dp),
                fontSize = 25.sp
            )

        }else{
            Text("Rondas: ${miViewModel.getContador()}",
                modifier = Modifier
                    .offset(y = 350.dp)
                    .offset(x = 55.dp),
                fontSize = 40.sp)
        }

        Button(//BOTON AZUL
            onClick ={},
            modifier = Modifier
                //.padding(vertical = 360.dp, horizontal = 110.dp)
                .offset(y = 400.dp)
                .offset(x = 50.dp)
                .size(100.dp)
                .background(Color.Blue)



        ) {

        }
        Button(//BOTON ROJO
            onClick ={},
            modifier = Modifier
                //.padding(vertical = 360.dp, horizontal = 110.dp)
                .offset(y = 550.dp)
                .offset(x = 50.dp)
                .size(100.dp)
                .background(Color.Red)


        ){

        }
        Button(//BOTON VERDE
            onClick ={},
            modifier = Modifier
                //.padding(vertical = 360.dp, horizontal = 110.dp)
                .offset(y = 400.dp)
                .offset(x = 200.dp)
                .size(100.dp)
                .background(Color.Green)


        ){

        }
        Button(//BOTON AMARILLO
            onClick ={},
            modifier = Modifier
                //.padding(vertical = 360.dp, horizontal = 110.dp)
                .offset(y = 550.dp)
                .offset(x = 200.dp)
                .size(100.dp)
                .background(Color.Yellow)


        ){

        }


        Button(//BOTON PLAY
            onClick ={ miViewModel.contador()},
            modifier = Modifier
                //.padding(vertical = 360.dp, horizontal = 110.dp)
                .offset(y = 673.dp)
                .offset(x = 220.dp)
                .size(70.dp)



        ){
            Image(
                painter = painterResource(id = R.drawable.lagartojuancho),//FREESVG.ORG PARA DESCARGAR MAS
                contentDescription = "Generar numeros",
                modifier = Modifier
                    .size(40.dp)

            )

        }

        botonStart()

    }//Cierra la Box

}

/**
 * FUNCION QUE CUANDO PULSO BOTON START
 * CAMBIA LA PALABRA POR RESET
 */
@Composable
fun botonStart() {
    var start = remember { mutableStateOf(true) }

    Button(
        onClick = {
            start.value = ! start.value
        },
        modifier = Modifier
            .offset(y = 680.dp)
            .offset(x = 65.dp)
            .size(100.dp, 60.dp)
    ) {
        Text(
            text = if (start.value) "START" else "RESET",
            fontWeight = FontWeight.Bold
        )
    }
}