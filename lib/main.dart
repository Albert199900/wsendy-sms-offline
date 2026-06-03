import 'package:flutter/material.dart';

void main() {
  runApp(const WSendyApp());
}

class WSendyApp extends StatefulWidget {
  const WSendyApp({super.key});

  @override
  State<WSendyApp> createState() => _WSendyAppState();
}

class _WSendyAppState extends State<WSendyApp> {
  ThemeMode _themeMode = ThemeMode.light;

  void _badiliTheme() {
    setState(() {
      _themeMode = _themeMode == ThemeMode.light ? ThemeMode.dark : ThemeMode.light;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'WSendy SMS',
      theme: ThemeData(brightness: Brightness.light, primarySwatch: Colors.blue),
      darkTheme: ThemeData(brightness: Brightness.dark, primarySwatch: Colors.teal),
      themeMode: _themeMode,
      home: Scaffold(
        appBar: AppBar(
          title: const Text('WSendy SMS Gateway'),
          actions: [
            IconButton(
              icon: const Icon(Icons.brightness_6),
              onPressed: _badiliTheme,
            )
          ],
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              const Icon(Icons.sms, size: 80, color: Colors.blue),
              const SizedBox(height: 20),
              const Text(
                'Hali ya Mfumo: ONLINE',
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
              ),
              const Text('Inasoma kutoka: https://wsendy.download'),
              const SizedBox(height: 30),
              ElevatedButton.icon(
                onPressed: () {},
                icon: const Icon(Icons.send),
                label: const Text('Tuma SMS (Offline/Online)'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
