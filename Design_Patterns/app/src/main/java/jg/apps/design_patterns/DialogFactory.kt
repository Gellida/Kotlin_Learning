package jg.apps.design_patterns
enum class DialogType{
    DIALOG_CREATE_CHAT,
    DIALOG_DELETE_MESSAGE,
    DIALOG_EDIT_MESSAGE,
}

sealed class Dialog{
    object CreateChatDialog : Dialog()
    object DeleteMessageDialog : Dialog()
    object EditMessageDialog  : Dialog()
}

object DialogFactory {
    fun createDialog(dialogType: DialogType) : Dialog{
        return when(dialogType){
            DialogType.DIALOG_CREATE_CHAT -> Dialog.CreateChatDialog
            DialogType.DIALOG_DELETE_MESSAGE -> Dialog.DeleteMessageDialog
            DialogType.DIALOG_EDIT_MESSAGE -> Dialog.EditMessageDialog

        }
    }

}