import customtkinter as c
janela=c.CTk()

janela.title('SGE - Sistema de Gerenciamento Escolar')
janela.geometry('700x500')
janela.resizable(False,False)

fr1=c.CTkFrame(
    master=janela,
    width=200,
    height=330,
    fg_color='teal',
    bg_color='transparent',
    border_width=10,
    corner_radius=30).place(
    x=10,
    y=60
)

fr2=c.CTkFrame(
    janela, 
    width=200, 
    height=330, 
    fg_color='light green').place(
        x=230,
        y=60
)

fr3=c.CTkFrame(
    janela,
    width=200,
    height=330,
    fg_color='light blue').place(
    x=450,
    y=60
)
janela.mainloop()