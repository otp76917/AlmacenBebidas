class Almacen {

    var matriz = Array(5){Array<Bebida?>(5){null} }

    fun agregar(b:Bebida)
    {
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                if (matriz[i][j]==null)
                {
                    if (checkId(b.id))
                    {
                        matriz[i][j]=b
                    }
                    else {
                        println("La bebida ya existe")
                    }
                }
            }
        }
    }

    fun checkId(id:Int):Boolean
    {
        var bool=true

        for (i in 0..4)
        {
            for (j in 0..4)
            {
                val beb= matriz[i][j]
                if (beb != null) {
                    if (beb.id==id) {
                        bool=false
                    }
                }
            }
        }

        return bool
    }

    fun eliminar(b:Bebida)
    {
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                if (matriz[i][j]!=null)
                {
                    if (!checkId(b.id))
                    {
                        matriz[i][j]=null
                    }
                    else {
                        println("La bebida no existe")
                    }
                }
            }
        }
    }

    fun mostrar()
    {
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                if (matriz[i][j]!=null)
                {
                    println("Bebida [$i][$j]: "+matriz[i][j].toString())
                }
            }
        }
    }

    fun calcular()
    {
        var total:Float = 0.0f
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                if (matriz[i][j]!=null)
                {
                    total+= matriz[i][j]?.precio ?: total
                }
            }
        }
    }

    fun calcular(marca:String)
    {

    }

    /*fun calcular()
    {

    }*/

}