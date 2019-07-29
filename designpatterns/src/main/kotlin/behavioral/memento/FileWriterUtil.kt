/*
package behavioral.memento

class FileWriterUtil(private var fileName: String?) {
    private var content: StringBuilder? = null

    init {
        this.content = StringBuilder()
    }

    override fun toString(): String {
        return this.content!!.toString()
    }

    fun write(str: String) {
        content!!.append(str)
    }

    fun save(): Memento {
        return Memento(this.fileName, this.content)
    }

    fun undoToLastSave(obj: Any) {
        val memento = obj as Memento
        this.fileName = memento.fileName
        this.content = memento.content
    }


    private inner class Memento(private val fileName: String, content: StringBuilder) {
        private val content: StringBuilder

        init {
            //notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
            this.content = StringBuilder(content)
        }
    }
}
*/
