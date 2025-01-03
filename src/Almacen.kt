class Almacen {

    var matriz = Array(5){Array<Bebida?>(5){null} }

    fun agregar(b:Bebida)
    {
        var end:Boolean=false
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                if (matriz[i][j]==null)
                {
                    if (checkId(b.id))
                    {
                        matriz[i][j]=b
                        end=true
                    }
                }
                if (end) break
            }
            if (end) break
        }
        if (!end) println("La bebida ya existe")
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

    fun eliminar(id:Int)
    {
        var end:Boolean=false
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                if (matriz[i][j]!=null)
                {
                    if (!checkId(id))
                    {
                        matriz[i][j]=null
                        end=true
                    }
                }
                if (end) break
            }
            if (end) break
        }
        if (!end) println("La bebida no existe")
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

    fun calcular():String
    {
        var total:Float = 0.0f
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                val beb:Bebida? = matriz[i][j]
                if (beb!=null)
                {
                    total+=beb.precio
                }
            }
        }
        return "%.2f".format(total)
    }

    fun calcular(marca:String):Float
    {
        var total:Float = 0.0f
        for (i in 0..4)
        {
            for (j in 0..4)
            {
                if (matriz[i][j]!=null)
                {
                    if (matriz[i][j]?.marca==marca)
                    {
                        total+= matriz[i][j]?.precio ?: total
                    }
                }
            }
        }
        return total
    }

    fun calcular(columna:Int):Float
    {
        var total:Float = 0.0f
        for (i in 0..4)
        {
            if (matriz[i][columna]!=null)
            {
                total+= matriz[i][columna]?.precio ?: total
            }
        }
        return total
    }

}