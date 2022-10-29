package airport

import java.io.FileInputStream
import java.util.*

interface ParamsLoader {
    fun load(file: String) {
        FileInputStream(file).use {
            this.loader(it)
        }
    }

    fun loader(file: FileInputStream)
}

abstract class Android {
    companion object : ParamsLoader {
        val properties = Properties()

        override fun loader(file: FileInputStream) {
            properties.load(file)
        }
    }

    object TCEnv: ParamsLoader {
        val properties = Properties()

        override fun loader(file: FileInputStream) {
            properties.load(file)
        }
    }

    object TCiOS: ParamsLoader {
        val properties = Properties()

        override fun loader(file: FileInputStream) {
            properties.load(file)
        }
    }
}

abstract class iOS: ParamsLoader {
    companion object {
        val iOSSpecificProperties = Properties()
    }
}