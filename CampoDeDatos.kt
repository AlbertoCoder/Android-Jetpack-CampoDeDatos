package com.albertoalvarezportero.autocontrol2

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CampoDeDatos(

    valor:String,
    valor_etiqueta:String,
    ancho:Float,
    espaciado:Int,
    tipoTeclado: KeyboardType,
    tamanyoFuenteContenido:Int,
    tamanyoFuenteEtiqueta:Int,
    activo:Boolean,
    onValueChange:(String) ->Unit


){

    var dato by remember{mutableStateOf(valor)}

    OutlinedTextField(

        modifier = Modifier.fillMaxWidth(ancho).padding(start=espaciado.dp,end=espaciado.dp),

        enabled = activo,
        value=dato,
        onValueChange={

            dato = it
            onValueChange(it)

        },
        label = {

            Row(

                modifier = Modifier
            ) {


                Text(

                    text =
                    valor_etiqueta,
                    fontSize = tamanyoFuenteEtiqueta.sp,

                )


            }

        },
        keyboardOptions = KeyboardOptions(keyboardType = tipoTeclado),

        textStyle = TextStyle(fontSize = tamanyoFuenteContenido.sp,textAlign= TextAlign.Center)
    )

}