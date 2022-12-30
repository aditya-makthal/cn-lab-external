import asyncio
import websockets

async def hello(ws):
    while(True):
        name = await ws.recv()
        await ws.send(name[::-1])

async def main():
    async with websockets.serve(hello,"localhost",8090):
        await asyncio.Future()

if __name__=="__main__":
    asyncio.run(main())