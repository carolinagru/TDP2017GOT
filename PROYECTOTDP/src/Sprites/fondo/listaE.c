#include <stdio.h>
#include <stdlib.h>
#include "lista.h"
#include "constante.h"
#include <assert.h>


 TLista crear_lista(){

    TLista list= (TLista) malloc(sizeof(TLista));
    list->cantidad_elementos=0;

    list->primer_celda = crear_Celda();



  return list;
}

//Nuevo
TCelda crear_Celda () {
    TCelda c = (TCelda) malloc (sizeof(TCelda));
    c ->elemento = NULL;
    c ->proxima_celda = NULL;
    return c;
}

TPosicion l_anterior(TLista lista, TPosicion pos){
int corte = 0;
TPosicion resultado;
    if (lista->cantidad_elementos == 0)
        exit(LST_NO_INI);

    if (pos == lista->primer_celda){
        resultado = POS_NULA;

    }
    else {
            if ( estaPos(lista,pos) == TRUE ){
                TPosicion pri = lista->primer_celda;
                while (pri ->proxima_celda != POS_NULA && corte == 0){
                    if (pri ->proxima_celda == pos){
                        resultado = pri;
                        corte = 1;
                    }
                    else pri = pri->proxima_celda;
                }
            }
    }
    if (corte == 0)
        resultado = POS_NULA;

     return resultado;
    }


int l_insertar(TLista lista, TPosicion pos, TElemento elem){

int resultado;

   if (pos == POS_NULA){
      lista->primer_celda->elemento = elem;
      lista ->cantidad_elementos++;
      resultado = TRUE;
   }
   else {
            TCelda nueva_celda = (TCelda) malloc(sizeof(TCelda));
            if (nueva_celda != NULL){
                nueva_celda ->elemento = elem;
                TPosicion posAnterior = l_anterior(lista,pos);
                    //Inserto en la primer posicion
                    if (posAnterior != POS_NULA){
                        nueva_celda->proxima_celda = pos;
                        posAnterior->proxima_celda = nueva_celda;
                    }
                    else{
                        lista->primer_celda = nueva_celda;
                        nueva_celda ->proxima_celda = pos;

                        }
            resultado = TRUE;
            lista->cantidad_elementos++;
            }


    }
 return resultado;
}



int l_eliminar(TLista lista, TPosicion pos){
int resultado;
    if (lista->cantidad_elementos == 0){
        resultado = LST_VAC;
        exit(LST_NO_INI);
    }
    else{
        if (pos == POS_NULA){
            resultado = LST_POS_INV;

        }
        else {
            if (estaPos(lista,pos) == 1){
                if ( pos != l_primera(lista)){
                    TPosicion posAnterior = l_anterior(lista, pos);
                    posAnterior->proxima_celda = l_siguiente(lista, pos);
                }
                else{
                    lista ->primer_celda = (l_siguiente(lista,lista->primer_celda));
                }
            resultado = TRUE;
            lista->cantidad_elementos--;
            free(pos);
            }
            else{
                resultado = LST_POS_INV;

            }
        }
    }
 return resultado;
}



TPosicion l_primera(TLista lista){

TPosicion resultado;
    if (lista->cantidad_elementos == 0)
        exit(LST_NO_INI);
    else
        resultado = lista->primer_celda;

   return resultado;
}

TPosicion l_ultima(TLista lista){

TPosicion resultado;
    if (lista->cantidad_elementos == 0)
        exit(LST_NO_INI);

    TPosicion pri = lista->primer_celda;
        while (pri -> proxima_celda != POS_NULA){
                pri = pri->proxima_celda;
            }
         resultado = pri;
   return resultado;
}


int estaPos(TLista lista, TPosicion pos){

int resultado;
if ( l_size(lista)!= 0){
    TPosicion pri = lista->primer_celda;
    int corte=0;
        while ((pri != POS_NULA) && (corte == 0)){

            if (pri == pos){
                corte = 1;
            }
            else
                pri= pri->proxima_celda;
       }
     if (corte == 1)
        resultado = TRUE;
    else
        resultado = LST_POS_INV;
}
else
    exit(LST_NO_INI);

return resultado;

}



TPosicion l_siguiente(TLista lista, TPosicion pos){

TPosicion resultado;

    if (lista->cantidad_elementos == 0)
        assert(LST_VAC);
    if (pos == l_ultima(lista) || pos == POS_NULA)
        resultado = POS_NULA;
    else {
           if (estaPos(lista, pos) == 1)
                resultado = pos->proxima_celda;
            else resultado = POS_NULA;
    }

  return resultado;
}

TElemento l_recuperar(TLista lista, TPosicion pos){

TElemento resultado;
    if (lista->cantidad_elementos == 0)
        assert(LST_VAC);
    if (pos == POS_NULA)
        resultado = ELE_NULO;
    else {
            if (estaPos(lista, pos) == 1)
                resultado = pos->elemento;
            else resultado = ELE_NULO;
         }
  return resultado;

}

int l_size(TLista lista){
  return lista ->cantidad_elementos;
}


void imprimirLista (TLista lista ) {
    printf("\n Imprimo lista :");
    TPosicion prim = lista ->primer_celda;
    while ( prim != NULL){
        printf(" - %d ",prim ->elemento);
        prim = prim ->proxima_celda;
        }
    }

int main(){
printf(" ----------------------------------- Tester LISTA -------------------------------");
TPosicion p1,p2,p3,p4,p5,p6,p8;
//Creo lista
TLista l = crear_lista();
TLista l2 = crear_lista();
/*
//l_insertar(l2,NULL,1);
//p5 = l_primera(l2);
int to = l_eliminar(l2,p1);
printf("cant Elem %i ", l_size(l2));
printf("res %i",to);
*/
//Inserto elementos


int resultado = l_insertar(l,NULL,8);
l_insertar(l,l_ultima(l),2);
l_insertar(l,l_ultima(l),3);
l_insertar(l,l_ultima(l),4);
l_insertar(l,l_primera(l),5);
l_insertar(l,l_ultima(l),6);


imprimirLista(l);

//Elimino elementos
printf("\n Se eliminan elementos - \n ");
p8 = l_ultima(l);
p6 = l_anterior(l,p8);
p1 = l_primera(l);
l_eliminar(l,p8);
l_eliminar(l,p6);
l_eliminar(l,p1);
int r =l_eliminar(l,p2);
//printf("Resultado eliminar %i",r);


imprimirLista(l);

return 0;
}

