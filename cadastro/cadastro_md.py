import customtkinter as ctk
from tkinter import messagebox

# parte de início do Model
class CadastroModel:
    def __init__(self):
        self.nome = ""
        self.crm = ""
        self.especialidade = ""
        self.telefone = ""
        self.email = ""

    def set_data(self, nome, crm, especialidade, telefone, email):
        self.nome = nome
        self.crm = crm
        self.especialidade = especialidade
        self.telefone = telefone
        self.email = email

    def validate_data(self):
        return all([self.nome, self.crm, self.especialidade, self.telefone, self.email])

    def get_data(self):
        return {
            "nome": self.nome,
            "crm": self.crm,
            "especialidade": self.especialidade,
            "telefone": self.telefone,
            "email": self.email
        }

# Parte do início do View
class CadastroView:
    def __init__(self, root, controller):
        self.root = root
        self.controller = controller
        self.cadastro_window = None
        self.entr_nome = None
        self.entr_crm = None
        self.entr_especialidade = None
        self.entr_telefone = None
        self.entr_email = None

    def setup_main_window(self):
        ctk.set_appearance_mode('dark')
        ctk.set_default_color_theme('green')
        self.root.geometry('350x350')
        self.root.title('Janela de Cadastro')
        self.root.resizable(False, False)

        ctk.CTkButton(
            self.root,
            text='Exibir Texto',
            command=self.controller.exibir_mensagem
        ).pack(pady=10)

        ctk.CTkButton(
            self.root,
            text='Criar Cadastro',
            command=self.controller.abrir_cadastro
        ).pack(pady=10)

        ctk.CTkButton(
            self.root,
            text='Fechar',
            command=self.controller.fechar
        ).pack(pady=10)

    def setup_cadastro_window(self):
        self.cadastro_window = ctk.CTkToplevel(self.root)
        self.cadastro_window.geometry('350x350')
        self.cadastro_window.title('Cadastro de Médico')
        self.cadastro_window.configure(fg_color='lightgreen')
        self.cadastro_window.resizable(False, False)

        frame = ctk.CTkFrame(self.cadastro_window)
        frame.pack(pady=5, padx=5, fill='both', expand=True)

        self.entr_nome = ctk.CTkEntry(frame, placeholder_text='Nome')
        self.entr_nome.pack(pady=5)

        self.entr_crm = ctk.CTkEntry(frame, placeholder_text='CRM')
        self.entr_crm.pack(pady=5)

        especialidades = [
            'Cardiologia', 'Ortopedia', 'Pediatria', 'Clínica Geral',
            'Dermatologia', 'Neurologia', 'Ginecologia', 'Cirurgia Geral'
        ]
        self.entr_especialidade = ctk.CTkOptionMenu(frame, values=especialidades)
        self.entr_especialidade.pack(pady=5)
        self.entr_especialidade.set('Selecione uma Especialidade')

        self.entr_telefone = ctk.CTkEntry(frame, placeholder_text='Telefone')
        self.entr_telefone.pack(pady=5)

        self.entr_email = ctk.CTkEntry(frame, placeholder_text='E-mail')
        self.entr_email.pack(pady=5)

        ctk.CTkButton(
            frame,
            text='Enviar',
            command=self.controller.enviar
        ).pack(pady=5)

        ctk.CTkButton(
            frame,
            text='Limpar',
            command=self.controller.limpar
        ).pack(pady=5)

        ctk.CTkButton(
            frame,
            text='Fechar',
            command=self.controller.fechar_cadastro
        ).pack(pady=5)

    def get_input_values(self):
        return {
            "nome": self.entr_nome.get(),
            "crm": self.entr_crm.get(),
            "especialidade": self.entr_especialidade.get(),
            "telefone": self.entr_telefone.get(),
            "email": self.entr_email.get()
        }

    def clear_inputs(self):
        self.entr_nome.delete(0, 'end')
        self.entr_crm.delete(0, 'end')
        self.entr_especialidade.set('Selecione uma Especialidade')
        self.entr_telefone.delete(0, 'end')
        self.entr_email.delete(0, 'end')

    def show_message(self, title, message):
        messagebox.showinfo(title, message)

    def show_warning(self, title, message):
        messagebox.showwarning(title, message)

    def close_cadastro(self):
        if self.cadastro_window:
            self.cadastro_window.destroy()
            self.cadastro_window = None

# Parte de início do Controller
class CadastroController:
    def __init__(self, model, view):
        self.model = model
        self.view = view

    def exibir_mensagem(self):
        print('Seja bem vindo')

    def abrir_cadastro(self):
        self.view.setup_cadastro_window()

    def fechar(self):
        self.view.root.destroy()

    def fechar_cadastro(self):
        self.view.close_cadastro()

    def limpar(self):
        self.view.clear_inputs()

    def enviar(self):
        data = self.view.get_input_values()
        self.model.set_data(
            data["nome"],
            data["crm"],
            data["especialidade"],
            data["telefone"],
            data["email"]
        )
        if self.model.validate_data():
            data = self.model.get_data()
            message = f"Nome: {data['nome']}\nCRM: {data['crm']}\nEspecialidade: {data['especialidade']}\nTelefone: {data['telefone']}\nE-mail: {data['email']}"
            print(message)
            self.view.show_message('Cadastro Realizado', message)
        else:
            self.view.show_warning('Campos Incompletos', 'Por gentileza, preencha todos os campos.')

# A parte onde vai ocorrer a Aplicação Principal
if __name__ == "__main__":
    root = ctk.CTk()
    model = CadastroModel()
    view = CadastroView(root, None)  
    controller = CadastroController(model, view)
    view.controller = controller  
    view.setup_main_window()  
    root.mainloop()