package br.com.jborges.meuservico

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MeuServico : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("MeuServico", "Servico Iniciado")
        return Service.START_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        // TODO: Return the communication channel to the service.
        throw UnsupportedOperationException("Ainda não implementado")
    }

    override fun onDestroy() {
        Log.i("MeuServico", "Serviço Parado")
        super.onDestroy()
    }
}
